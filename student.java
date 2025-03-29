class Student {
    public static void main(String args[]) {
        if (args.length < 3) {
            System.out.println("Please provide name, rollno, and dept as command-line arguments.");
            return; // Exit if there are not enough arguments
        }

        String name = args[0];
        int rollno = Integer.parseInt(args[1]); // Convert the roll number to an integer
        String dept = args[2];

        System.out.println("Name: " + name+"\n" + ", Roll No: " + rollno + "\n"+", Dept: " +"\n"+ dept); 
    }       
}
