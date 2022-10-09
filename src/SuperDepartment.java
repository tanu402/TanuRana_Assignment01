
public class SuperDepartment {
	 public String departmentName()
	 {
	 
	return "Welcome to Super Deprtment";
	 }
	public  String getTodaysWork()
	{

		return "No Work as of now";
	}
	public String getWorkDeadline()
	{
		return "Nil";
	}
	public  String isTodayAHoliday()
     
     {
    	 return "Today is not a Holiday \n";
     }
	
}

class AdminDepartment extends SuperDepartment
{
	public String  departmentName()
	{
		return "Welcome to Admin Department";
	}
    public String getTodaysWork ()
{
    	return "Complete your documents Submission";
}
    public String getWorkDeadline ()
    {	
    	return "Complete by EOD ";
    }
    }


class HrDepartment extends SuperDepartment

{
	
	public String departmentName()
	{
		return "Welcome to Hr Department";
	}
	public String getTodaysWork()
	{
		return "Fill today’s worksheet and mark your attendance";
	}
	public String getWorkDeadline ()
	{
		return "Complete by EOD";
	}
	public  String doActivity ()
	{
		return "team Lunch";
	}
	
}

class TechDepartment extends SuperDepartment
{

	public  String departmentName()
	{
		return "Welcome to Tech Department ";
	}
	public  String getTodaysWork ()
	{
		return "Complete coding of module 1";
	}
	public String getWorkDeadline ()
	{
		return "Complete by EOD ";
	}
	public  String getTechStackInformation ()
	{
		return "core Java";
	}


	
public static void main (String args[])

{
	AdminDepartment AdDe = new AdminDepartment();
	HrDepartment    HrDe = new HrDepartment();
	TechDepartment  TeDe  = new TechDepartment ();
	System.out.println(AdDe.departmentName());
	System.out.println(AdDe.getTodaysWork());
	System.out.println(AdDe.getWorkDeadline());
	System.out.println(AdDe.isTodayAHoliday());
	System.out.println(HrDe.departmentName());
	System.out.println(HrDe.doActivity());
	System.out.println(HrDe.getTodaysWork());
	System.out.println(HrDe.getWorkDeadline());
	System.out.println(HrDe.isTodayAHoliday());
	System.out.println(TeDe.departmentName());
    System.out.println(TeDe.getTodaysWork());
    System.out.println(TeDe.getWorkDeadline ());
    System.out.println(TeDe.getTechStackInformation());
    System.out.println(TeDe.isTodayAHoliday());
}
};

