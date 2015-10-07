import javax.swing.JOptionPane;
public class Assignment3 {
public static final int LIMIT = 3;
public static void main(String[] args) {
// TODO Auto-generated method stub
String part1Username = "egrammer";
String part1Password = "ekg3java!";
/**************************************************************************************
*
* This section begins Part 1 of Assignment 3
*
**************************************************************************************/
int count = 0;
String userName = "";
String passWord = "";
boolean invalidUser = true;
boolean invalidPassword = true;
JOptionPane.showMessageDialog(null, "Assignment 3 Part 1");
// enter and validate user name
while (invalidUser && (count < LIMIT)){
userName = JOptionPane.showInputDialog("Enter username:");
if (userName.equals (part1Username))
	invalidUser = false;
else{JOptionPane.showMessageDialog(null, "Invalid Username " + userName );
userName = "";
count ++;
}
}
// enter and validate password
while (invalidPassword && (count < LIMIT)){
passWord = JOptionPane.showInputDialog("Enter password:");
if (passWord.equals (part1Password))
	invalidPassword = false;
else{ JOptionPane.showMessageDialog(null, "Invalid password " + passWord );
count ++;
}
}
if (count < LIMIT)JOptionPane.showMessageDialog(null, "Welcome " + userName);
else JOptionPane.showMessageDialog(null, "Contact Admin " );

/**************************************************************************************
** This section begins Part 2 of Assignment 3*
**************************************************************************************/

JOptionPane.showMessageDialog(null, "Assignment 3 Part 2");
String adminUsername = "wgrammer";
String adminPassword = "wsg1java!";
String staffUsername = "pgrammer";
String staffPassword = "pfg2java!";
String studentUsername = "egrammer";
String studentPassword = "ekg3java!";
String[] choices = { "Admin", "Student", "Staff"};
boolean accountIsAdmin = false;
boolean accountIsStudent = false;
boolean accountIsStaff = false;
boolean invalidAcctType = true;
invalidUser = true;
invalidPassword = true;
count = 0;
userName = "";
passWord = "";
// Select Account Type
while (invalidAcctType && (count < LIMIT)){
invalidUser = true;
invalidPassword = true;
String input = (String) JOptionPane.showInputDialog(null, "Choose account type...","Account Type",JOptionPane.QUESTION_MESSAGE, null,choices,choices[1]);System.out.println(input);
// Enter and Validate user name
while (invalidUser && (count < LIMIT)){
userName = JOptionPane.showInputDialog("Enter username:");
if (userName.equals (adminUsername)){
accountIsAdmin = true;
invalidUser = false;}
else if (userName.equals(staffUsername)){accountIsStaff = true;
invalidUser = false;}
else if (userName.equals(studentUsername)){accountIsStudent = true;
invalidUser = false;}
else{JOptionPane.showMessageDialog(null, "Invalid Username " + userName );
userName = "";
count ++;
}

}// Enter and Validate password
while (invalidPassword && (count < LIMIT))
{passWord = JOptionPane.showInputDialog("Enter password:");
if ((passWord.equals (adminPassword)) && (userName.equals(adminUsername)))
{accountIsAdmin = true;
invalidPassword = false;}
else if ((passWord.equals(staffPassword)) && (userName.equals(staffUsername))){
accountIsStaff = true;
invalidPassword = false;}
else if ((passWord.equals(studentPassword)) && (userName.equals(studentUsername))){accountIsStudent = true;
invalidPassword = false;}
else{
// if program get to this point username does not match with password.
accountIsAdmin = false;
accountIsStaff = false;
accountIsStudent = false;
passWord = "";
count++;}}
switch (input){
case "Admin":
if (accountIsAdmin){
JOptionPane.showMessageDialog(null, "Welcome Admin! You can update, read, add, delete files." );
invalidAcctType = false;
}
break;
case "Student":
if (accountIsStudent){
JOptionPane.showMessageDialog(null, "Welcome Student! You can only read files." );
invalidAcctType = false;}
break;
case "Staff":
if (accountIsStaff){
JOptionPane.showMessageDialog(null, "Welcome Staff! You can update and read files." );
invalidAcctType = false;}
break;
default:invalidAcctType = true;
}
}
//end Account Type while loop
if (count >= LIMIT)JOptionPane.showMessageDialog(null, "Contact Admin " );
System.exit(0);
}
}
