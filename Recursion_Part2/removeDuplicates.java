package Recursion_Part2;
public class removeDuplicates {
    public static void removeDuplicate(String str, int index ,StringBuilder newString, boolean map[]){
//base case
if(index==str.length()){
    System.out.println(newString);
    return;
}


char currentString = str.charAt(index);
if(map[currentString-'a']==true){
    //if current string is present in the map array then , we'll increase index and move on 
    removeDuplicate(str,index+1,newString,map);

}
else{
    map[currentString-'a']=true;
    removeDuplicate(str,index+1,newString.append(currentString),map);
}

    }
    public static void main(String args[]){
String str="shreyashi";
removeDuplicate(str,0,new StringBuilder(""),new boolean[26]);
    }
}


// StringBuilder → editable string(StringBuilder is a mutable class in Java used to create and modify strings without creating new objects.)