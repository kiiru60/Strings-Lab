
/**
 * Write a description of class OurString here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OurString
{

    private int myLength;
    private char[] myArray;

    /**
     * Constructor for class OurString
     */
    public OurString()
    {
        this.myArray= new  char[0];
        this.myLength=0;

    }

    public OurString(char[] data){

        myArray = new char[data.length];
        for (int i=0; i<data.length; i++){

            myArray[i] =data[i];

        }
        myLength=data.length;
    }

    public OurString(String original){
        myArray = new char[original.length()];
        for (int i=0; i< original.length(); i++){

            myArray[i]=original.charAt(i);

        }
        myLength = original.length(); 
    }

    public String toString(){
        String myString= "";
        for (int i=0;i<myArray.length;i++){
            myString= myString+ myArray[i]; 
        }
        return myString;
    }

    public int length(){
        return myLength;
    }

    public char charAt(int index ){
        if ( index < 0 || index >= myLength ) // in case of an illegal index...
        {
            throw new IndexOutOfBoundsException(); // throw an exception
        }
        return myArray[index];
    }

    public boolean equals (OurString other ){
        boolean elementsMatch= false;
        if (myArray.length!= other.myLength){
            elementsMatch=false;
        } 
        if(myArray.length==0 && other.myLength==0){
            elementsMatch= true;
        }
        for(int i=0;i < myArray.length; i++){
            if(myArray[i]!= other.charAt(i) )
                elementsMatch= false;
            else{
                elementsMatch= true;
            } 
        }
        return elementsMatch;
    }

    public boolean startswith(OurString other){
        boolean elementsMatch= false;
        if (myArray.length!= other.myLength){
            return false;
        }
        for(int i=0;i < myArray.length; i++){
            if(myArray[i]< other.charAt(i))
                elementsMatch= false;
            else{
                elementsMatch= true;
            } 
        }
        return elementsMatch; 
    }

    public int indexOf(char ch){
        int index=0;
        if (myArray.length==0 ){
            return index=-1;
        }
        for(int i=0;i<myArray.length;i++){
            if(charAt(i)==ch){
                index=i;
            }else {
                index=-1;
            }
        }
        return index;
    }

    public int indexOf(char ch, int fromIndex){
        int index=0;
        if ( index < 0 || fromIndex >= myLength ) // in case of an illegal index...
        {
            throw new IndexOutOfBoundsException(); // throw an exception
        }
        
        if (myArray.length==0 ){
            index=-1;
        }
        for(int i=0;i<myArray.length;i++){
            if(charAt(i)==ch && charAt(i)>= fromIndex){
                index=i;
            }else {
                index=-1;
            }
        }
        return index;   
    }

    public OurString toUpperCase(){
        char [] local = new char[this.myLength];
        for(int i =0;i<this.myLength;i++){
            local[i]= Character.toUpperCase(this.myArray[i]);
        }
        OurString result = new OurString(local);
        return result;
    }

    public OurString toLowerCase(){
        char [] local = new char[this.myLength];
        for(int i =0;i<this.myLength;i++){
            local[i]= Character.toLowerCase(this.myArray[i]);
        }
        OurString result = new OurString(local);
        return result;
    }

    public OurString substring(int startIndex)throws IndexOutOfBoundsException{
        char [] local= new char [myArray.length-startIndex];
        int newArray= myArray.length-startIndex;
        for(int i =startIndex;i<myArray.length;i++){
            local[i-startIndex]= myArray[i];
        }
        OurString result = new OurString(local);
        return result;
    }
    public boolean endswith(OurString other){
        boolean elementsMatch= false;
        if (myArray.length!= other.myLength){
            return elementsMatch= false;
        }else if(myArray.length== 0 && other.myLength==0){
            return elementsMatch= true;
        }
        for(int i=0;i < myArray.length; i++){
            if(myArray[i]> other.charAt(i))
                elementsMatch= false;
            else{
                elementsMatch= true;
            } 
        }
        return elementsMatch; 
    }
    public int lastIndexOf(char ch){
        int index=0;
        if(myArray.length==0){
            return index=-1;
        }
        for(int  i=myArray.length-1;i>=0;i--){
            if(charAt(i)==ch){
                index=i;
            }else{
                index=-1;
            }
        }
        return index;
    }
    public int lastIndexOf(char ch, int fromIndex){
        int index=0;
        
        if(myArray.length==0){
            return index=-1;
        }
        for(int i=myArray.length;i>=0;i++){
            if(charAt(i)==ch && charAt(i)>= fromIndex){
                index= i;
            }else {
                index=-1;
            }
        }
        return index;   
    }
    
 }
