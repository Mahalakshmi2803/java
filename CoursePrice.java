class CoursePrice{
	public static void price(Courses Name){
		if(Name==Courses.PYTHON){
			System.out.println(Name+": 5000 price");
		}
		else if(Name==Courses.JAVA){
			System.out.println(Name+": 5500 price");
		}
		else if(Name==Courses.CSS){
			System.out.println(Name+": 4000 price");
		}
		else if(Name==Courses.MYSQL){
			System.out.println(Name+": 4500 price");
		}
		else if(Name==Courses.HTML){
			System.out.println(Name+": 3000 price");
		}
	}
}
