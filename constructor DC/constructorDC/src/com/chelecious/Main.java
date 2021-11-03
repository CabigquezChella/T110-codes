package com.chelecious;

public class Main {

    public static void main(String[] args) {



            Employees num1Employee = new Employees( 1102070991,20000,"Chella") ;;//creating an object of Student
            Employees num2Employee = new Employees(24112, 30000,"facunla") ;

            //Printing values of the objects
            System.out.println("Name:"+num1Employee.Name);
            System.out.println("ID:"+num1Employee.ID);
            System.out.println("Salary:"+num1Employee.Salary);
            System.out.println("Name:"+ num2Employee.Name);
            System.out.println( "ID:"+num2Employee.ID);
            System.out.println( "Salary:"+num2Employee.Salary);


    }

        //Defining an Employees class.
        public static class Employees{
            //defining fields
            public int ID;//field or data member or instance variable
            public String Name;
            public double Salary;

            //constructor
            Employees(int ID,double Salary, String Name){
                Salary=Salary*0.10;
                this.ID = ID;
                this.Name = Name;
                this.Salary=Salary;

            }
        }

    }


