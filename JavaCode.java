class EmployeeDetails {
        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public int getExperience() {
            return Experience;
        }

        public void setExperience(int experience) {
            Experience = experience;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPosition() {
            return Position;
        }

        public void setPosition(String position) {
            Position = position;
        }

        public String getEducationalevel() {
            return Educationalevel;
        }

        public void setEducationalevel(String educationalevel) {
            Educationalevel = educationalevel;
        }

        //Creating properties of Employee class
        int salary,Experience;
        String name, Position, Educationalevel;

        //Getter and setters for getting and setting properties
        
   
        }
        @Override
        public String toString() {
            return "salary = " + salary + ", name = " + name + ", ppstion = " + postion
                    + ", educationalLevel = " + educationalLevel + ", experince = " + experince + "]";
        }
    }
    //Creating main class
    public class Employee{

        public static void main(String args[]) {

            //Creating object of EmployeeDetails class
            EmployeeDetails emp = new EmployeeDetails();
            emp.setName("Amal");
            emp.setPosation("IT");
            emp.setSalary(15000);
            emp.setexperince(2);
            emp.setEducationalevel("diploma");
            System.out.println(emp);

            //Getting salary using getter
            int sal = emp.getSalary();
            int increment = 0;
            if (setEducationalevel()=="diploma")
            {
                System.out.println(getsalary()+500);
             

            }else if (setEducationalevel()=="bachloer"){
                System.out.println(getsalary()+250);

            }else {
                System.out.println(getsalary()+250);
               
            }
