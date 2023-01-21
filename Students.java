 public class Students {

int RollNumber;

long PhoneNumber;

String Address;

}

public class CreateClass {

public static void main(String[] args) {

Student Sam = new Student();

Student John = new Student();

Sam.RollNumber=20;

Sam.PhoneNumber=9087654321L;

Sam.Address="Faridabad";

John.RollNumber=14;

John.PhoneNumber=9765416230L;

John.Address="Noida";

System.out.println(Sam.RollNumber+" "+Sam.PhoneNumber+" "+Sam.Address); System.out.println(John.RollNumber+" "+John.PhoneNumber+" "+John.Address);

}

} 

