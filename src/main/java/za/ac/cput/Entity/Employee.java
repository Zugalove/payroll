package za.ac.cput.Entity;

import javafx.util.Builder;

public class Employee {
    private  String employeeNumber, firstName, lastName;

    public Employee(Builder builder) {

        this.firstName=builder.firstName;
        this.lastName=builder.lastName;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public  static class Builder{
     private  String employeeNumber, firstName, lastName;

     public Builder setEmployeeNumber(String employeeNumber) {
         this.employeeNumber = employeeNumber;
         return  this;
     }

     public Builder setFirstName(String firstName) {
         this.firstName = firstName;

         return  this;
     }

     public Builder setLastName(String lastName) {
         this.lastName = lastName;
         return  this;
     }
     public  Employee  build(){

         return  new Employee(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "employeeNumber='" + employeeNumber + '\'' +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }
        public Builder copy(Employee employee){
         this.employeeNumber=employeeNumber;
         this.firstName= employee.lastName;
         return  this;
        }
    }
}


