class pr10
{
        int java=70;    
        int php=76;    
        int SE=74;    
        int wp=74;
        int total=java+php+SE+wp;
        int per=total/4;
        int Grade;
    
    
    if(Grade<=80){
        System.out.println("Grade:A");
    }
    else if(Grade<=60){
        System.out.println("Grade:B");
    }
    else if(Grade<=45){
        System.out.println("Grade:C");
    }
    else if(Grade<=20){
        System.out.println("You are failed,try again");
    }
}

class Student
{
    public static void main(String[] args) {
        student s1=new student();
        s1.display();     
    }
}