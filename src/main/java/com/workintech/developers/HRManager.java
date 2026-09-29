package com.workintech.developers;

public class HRManager extends Employee {

private JuniorDeveloper [] juniorDevelopers;
private  MidDeveloper [] midDevelopers;
private SeniorDeveloper [] seniorDevelopers;
public HRManager (int id, String name, double salary){
    super(id, name, salary);
this.juniorDevelopers = new JuniorDeveloper[10];
this.midDevelopers = new MidDeveloper[10];
this.seniorDevelopers = new SeniorDeveloper[10];

}
@Override 
    public void work(){
        System.out.println("HR manager starts working");
        super.setSalary(this.getSalary());

    }

public void addEmployee(JuniorDeveloper juniorDeveloper, int index){
    if(index>-1 && index<this.juniorDevelopers.length){
        if(this.juniorDevelopers[index]!=null){
        System.out.println("full! " + index + " is full:(");
    }
        else {
        this.juniorDevelopers[index]=juniorDeveloper;
    }
    }
    else{
        System.out.println("Invalid index " + index);
    }

}
public void addEmployee(MidDeveloper midDeveloper, int index){
    if(index>-1 && index<this.midDevelopers.length){
        if(this.midDevelopers[index]!=null){
            System.out.println("full! " + index + " is full:(");
        }
        else {
            this.midDevelopers[index]=midDeveloper;
        }
    }
    else{
        System.out.println("Invalid index " + index);
    }
}
public void addEmployee(SeniorDeveloper seniorDeveloper, int index){
    if(index>-1 && index<this.seniorDevelopers.length){
        if(this.seniorDevelopers[index]!=null){
            System.out.println("full! " + index + " is full:(");
        }
        else {
            this.seniorDevelopers[index]=seniorDeveloper;
        }
    }
    else{
        System.out.println("Invalid index " + index);
    }
}
}
