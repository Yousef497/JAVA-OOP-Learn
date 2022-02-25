public class Rev {

    public static void main(String[] args){

        Department d1 = new Department(1, "Information Systems");

        SalariedEmployee se = new SalariedEmployee("Ahmed", "Riyadh", 1200, Gender.Male, 2000, 500, 50);

        d1.add_employee(se);

        HourlyEmployee he = new HourlyEmployee("Mohammed", "Riyadh", 1200, Gender.Male, 100, 6);

        d1.add_employee(he);

        ComissionEmployee ce = new ComissionEmployee("Ali", "Riyadh", 1200, Gender.Male, 15000,0.25);

        d1.add_employee(ce);

        d1.print_basic_data();
        d1.print_all_details();

    }

}
