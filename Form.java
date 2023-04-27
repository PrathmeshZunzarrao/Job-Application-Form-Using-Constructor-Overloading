class Form
{
    String name;
    long mob;
    String Degree;
    String Branch;
    int Yop ;
    
    
    String Blood;
    String Gender;
    int age;
    
    Form()
    {
        
    }
    
    Form(String name,long mob, String Degree, String Branch, int Yop)
    {
        this.name = name;
        this.mob = mob;
        this.Degree = Degree;
        this.Branch = Branch;
        this.Yop = Yop;
    }

	Form(String name,long mob, String Degree, String Branch, int Yop, String Blood, String Gender)
    {
        this.name = name;
        this.mob = mob;
        this.Degree = Degree;
        this.Branch = Branch;
        this.Yop = Yop;

		this.Blood = Blood;
		this.Gender = Gender;
    }
    
    public void showData()
    {
        System.out.println("Name of Candidate : " + name);
        System.out.println("Contact no. : " + mob);
        System.out.println("Degree : " + Degree);
        System.out.println("Branch : " + Branch);
        System.out.println("YOP : " + Yop);
        
        System.out.println("Blood Group : " + Blood);
        System.out.println("Gender : " + Gender );
        System.out.println("Age  : " + age);
    }
}
