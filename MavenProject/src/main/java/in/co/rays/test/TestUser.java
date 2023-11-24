package in.co.rays.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

public class TestUser {

	public static void main(String[] args) throws Exception {
	//	testAdd();
	//	testUpdate();
		//testDelete();
		testAuthenticate();
	}

	private static void testAuthenticate() throws Exception {
		

			 
      	  
       	 UserModel model = new UserModel();
       	 UserBean bean =model.authenticate("yash@gmail.com", "123");
       	 
       	 if (bean != null) {
       	
       		 System.out.println(bean.getId());
       		 System.out.println(bean.getFirstName());
       		 System.out.println(bean.getLastName());
       		 System.out.println(bean.getLoginId());
       		 System.out.println(bean.getPassword());
       		 System.out.println(bean.getDob());
       		 System.out.println(bean.getAddress());
			}
       	else 
           {
       		 System.out.println("User does not Exist.......!!!!");
       	 }
	}

	private static void testDelete() throws Exception {
		
		 UserBean bean = new UserBean();
		//  bean.setId(12);
		 UserModel model = new UserModel();
		 
		 
		  model.delete(9);
	}

	private static void testUpdate() throws Exception {
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		  UserBean bean = new UserBean();
		  
		    bean.setFirstName("rohit");
		    bean.setLastName("sharma");
		    bean.setLoginId("rohti@gmail.com");
		    bean.setPassword("123");
		    bean.setDob(sdf.parse("2003-05-05"));
		    bean.setAddress("dewass");
		    bean.setId(1);
		     
		     UserModel  model = new UserModel();
		     model.update(bean);
	}

	public static void testAdd() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		UserBean bean = new UserBean();

		bean.setId(14);
		bean.setFirstName("vishu");
		bean.setLastName("sharma");
		bean.setLoginId("r@gmail.com");
		bean.setPassword("12336");
		bean.setDob(sdf.parse("2003-05-04"));
		bean.setAddress("rewa");

		UserModel model = new UserModel();
		model.add(bean);

	}
}
