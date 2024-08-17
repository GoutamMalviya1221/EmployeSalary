package employeSalary;

public class Employee {

        private int employeeId;
        private String employeeName;
        private double salary;
        private double netSalary;

        // Getter and setter for employeeId
        public int getEmployeeId() {
            return employeeId;
        }

        public void setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
        }

        // Getter and setter for employeeName
        public String getEmployeeName() {
            return employeeName;
        }

        public void setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
        }

        // Getter and setter for salary
        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        // Getter for netSalary
        public double getNetSalary() {
            return netSalary;
        }

        // Method to calculate net salary
        public void calculateNetSalary(int pfPercentage) {
            double pfAmount = (salary * pfPercentage) / 100;
            this.netSalary = salary - pfAmount;
        }

}
