JDBC
1. 认知 : JDBC->规范 , 和数据库交互 , 
接口 
Connection --->   Queue
PreparedStatement   -> executeUpdate()->row  ; executeQuery->rs 
ResultSet --> rs.next--> getObject("col" / index)
releaseResources
2. wrap 封装思想
	CRUD	-> 变 ： sql ， params  -->  配置分离
	1. 增删改
	2. 查询	
		1. select 内容 from Table where .... 能够将结果构造成Bean
		2. select a.x , a.y , a.z , b.m , c.n from a,b,c : result > invoke

	3. 反射机制	Apache-beanUtils
	4. 泛型DAO
	
2.extends --> apache-dbutils , spring-data-jdbc
 
3. DAO 设计模式 , 让数据交互的业务独立划分为一个层次 / Repository
	OrdersDao : 
4. 批处理 , 事物 (ACID)
5. 连接池 DBCP ALI C3P0 SPRING , JNDI        PERSON P = LOOKUP