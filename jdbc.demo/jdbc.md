JDBC
1. ��֪ : JDBC->�淶 , �����ݿ⽻�� , 
�ӿ� 
Connection --->   Queue
PreparedStatement   -> executeUpdate()->row  ; executeQuery->rs 
ResultSet --> rs.next--> getObject("col" / index)
releaseResources
2. wrap ��װ˼��
	CRUD	-> �� �� sql �� params  -->  ���÷���
	1. ��ɾ��
	2. ��ѯ	
		1. select ���� from Table where .... �ܹ�����������Bean
		2. select a.x , a.y , a.z , b.m , c.n from a,b,c : result > invoke

	3. �������	Apache-beanUtils
	4. ����DAO
	
2.extends --> apache-dbutils , spring-data-jdbc
 
3. DAO ���ģʽ , �����ݽ�����ҵ���������Ϊһ����� / Repository
	OrdersDao : 
4. ������ , ���� (ACID)
5. ���ӳ� DBCP ALI C3P0 SPRING , JNDI        PERSON P = LOOKUP