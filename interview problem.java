/*Interview candidate’s one person is the referral candidate, and each 
candidate is given an interview ID no.HR staff was given a list containing 
the list of candidates attended for the interview. If the referral candidate 
attends the he will be in the selected list. Given the list of interview ID 
numbers, the task of the HR staff is to search for an interview; the 
candidates are waiting outside for their turn. Among these the referral 
candidates ID no. Help HR staff to complete the task. To model this 
scenario, create a class Interview with a static method search () which 
accepts an array of integers which represent all the candidates ID numbers 
and a referral candidate ID number. If referral candidate ID is present in 
array return true otherwise, return false. Access the methods in Interview 
class from main () of HR class. (Take input through command line)
Class Diagram:
Program:*/
HR.JAVA
public class HR {
 // Static method to search for the referral candidate ID in the array
 public static boolean search(int[] CID, int refID) {
 for (int i=0;i<CID.length-1; i++) {
 if (CID[i] == refID) {
 return true;
 }
 }
 return false;
 }
}
Interview.java
public class Interview {
 public static void main(String[] args) {
 if (args.length == 0) 
{
 System.out.println("No integers provided.");
 return;
 }
 
 int[] arr = new int[args.length - 1];
 for (int i = 0; i < args.length - 1; i++) {
 arr[i] = Integer.valueOf(args[i]);
 }
 
 
 int refID = Integer.valueOf(args[args.length - 1]);
 
 
 boolean isCandidatePresent = HR.search(arr, refID);
 
 
 if (isCandidatePresent) {
 System.out.println("Referral candidate is present in the 
list.");
 } else {
 System.out.println("Referral candidate is not present in the 
list.");
 }
 }
}
