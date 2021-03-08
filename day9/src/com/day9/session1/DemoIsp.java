package com.day9.session1;
class MyGodClass implements TeamALogic, TeamBLogic{
    public void doWork1() {
        System.out.println("doWork1 logic goes here...");
    }

 

    public void doWork2() {
        System.out.println("doWork2 logic goes here...");
    }

 

    public void doWork3() {
        System.out.println("doWork3 logic goes here...");
    }

 

    public void doWork4() {
        System.out.println("doWork4 logic goes here...");
    }
}
interface TeamALogic{
    public void doWork1() ;
    public void doWork3(); 
}

interface TeamBLogic{
    public void doWork4(); 
}

 

//team A: i want to force that teamA must able to call only two method doWork1() doWork3()
class TeamA{
    
    private TeamALogic class1=new MyGodClass();
    
    public void doLogivTeamA(){
        class1.doWork1();
        class1.doWork3();
    }
}

class TeamB{
    
    private TeamBLogic class1=new MyGodClass();
    
    public void doLogivTeamA(){
        class1.doWork4();
    }
}

 

public class DemoIsp {
    public static void main(String[] args) {
    	
 

    }

 

}

