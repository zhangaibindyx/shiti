//�������ݿ�
CREATE DATABASE d_question;
//�����ݿ�
USE d_question;

//��������
/*Android IOS JAVA �ȵ�*/
CREATE TABLE d_category(c_id INT PRIMARY KEY AUTO_INCREMENT,
  c_title VARCHAR (80) NOT NULL);
  
//�������ͱ�  �����  ѡ����  �����
CREATE TABLE d_type(t_id INT PRIMARY KEY AUTO_INCREMENT,
t_title VARCHAR (15) NOT NULL);

// �𰸽�����
// �Դ𰸵Ľ���  q_id ��Ӧ�����������
	CREATE TABLE d_analysis(as_id INT PRIMARY KEY AUTO_INCREMENT,
	as_text VARCHAR(300) NOT NULL,
	q_id INT NOT NULL,
	as_time VARCHAR(50) NOT NULL);

// �����
CREATE TABLE d_question(q_id INT PRIMARY KEY AUTO_INCREMENT,
q_title VARCHAR(300) NOT NULL,
q_time VARCHAR(50) NOT NULL);

// ������ Short Answer Questions
/**����   ���� ���id ����id ��id ����id */
CREATE TABLE d_saq(s_id INT PRIMARY KEY AUTO_INCREMENT,
q_id INT NOT NULL UNIQUE,
s_content VARCHAR(300) NOT NULL,
c_id INT NOT NULL,
t_id INT NOT NULL,
a_id INT NOT NULL);

//ѡ�����Choice question
/***����  ���� ѡ�Ĭ���ĸ��� ����id ��id ����id*/
CREATE TABLE d_choice_question(cq_id INT PRIMARY KEY AUTO_INCREMENT,
q_id INT NOT NULL UNIQUE,
cq_contnet VARCHAR(300) NOT NULL,
cq_choice_a VARCHAR(300) NOT NULL,
cq_choice_b VARCHAR(300) NOT NULL,
cq_choice_c VARCHAR(300) NOT NULL,
cq_choice_d VARCHAR(300) NOT NULL,
c_id INT NOT NULL,
t_id INT NOT NULL,
a_id INT NOT NULL
);

// �𰸱�
CREATE TABLE d_answer(ans_id INT PRIMARY KEY AUTO_INCREMENT,
ans_answer VARCHAR(300) NOT NULL,
q_id INT NOT NULL
);



//�û���
CREATE TABLE d_user(u_id INT PRIMARY KEY AUTO_INCREMENT,
u_name VARCHAR(50) NOT NULL UNIQUE,
u_password VARCHAR(50) NOT NULL);

// �û������
CREATE TABLE d_user_content(uc_id INT PRIMARY KEY AUTO_INCREMENT,
u_id INT NOT NULL UNIQUE,
uc_nice VARCHAR(50) UNIQUE,
uc_phone VARCHAR(50) UNIQUE,
uc_address VARCHAR(50) ,
uc_qq VARCHAR(50) UNIQUE,
uc_email VARCHAR(50) UNIQUE,
uc_garnd VARCHAR(50) ,
uc_age INT (3),
uc_school VARCHAR(100)
);


//���۱�comment
CREATE TABLE d_comment(cm_id INT PRIMARY KEY AUTO_INCREMENT,
cm_content VARCHAR(300) NOT NULL,
u_id INT NOT NULL,
cm_time VARCHAR(50) NOT NULL);

//�ղر�Collection
CREATE TABLE d_collection(co_id INT PRIMARY KEY AUTO_INCREMENT,
u_id INT NOT NULL,
q_id INT NOT NULL
);









