/*
 * Class: CMSC203 
 * Instructor: Prof Eivazi
 * Description: uses various methods to work with data 
   sets from files and use them with arrays, and then
   analyzing the data to return findings
 * Due: 11/23/2022
 * Platform/compiler: Java
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Axel Kiti
*/


import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {
	
	static double[][] dist5_array = new double[6][6];
	
	//Constructor:
	public TwoDimRaggedArrayUtility()
	{
		
	}
	
	
	//Methods:
	/**
	 * Reads from a file and returns a ragged array of doubles The maximum rows is 10 and the 
	 * maximum columns for each row is 10 Each row in the file is separated by a new line Each 
	 * element in the row is separated by a space Suggestion: You need to know how many rows 
	 * and how many columns there are for each row to create a ragged array. 1. Read the 
	 * doubles from the file into a temporary array [MAX_ROW][MAX_COLUMN] of Strings which was 
	 * initialized to nulls. 2. Find out how many rows there are (any row that has the first 
	 * element != null is a valid row) 3. Create the array based on the number of rows, i.e. 
	 * double[][]array = new double[#rows][] 4. Determine the number of columns for the first 
	 * row (any element != null is a valid element) 5. Create the first row, i.e. array[0] = new 
	 * double[#columns] 6. Put the values from the temporary array into in the row (don't forget 
	 * to convert from strings to doubles) 7. Repeat for all rows
	 * 
	 * @param file - the file to read from 
	 * @return a two dimensional ragged (depending on data) 
	 * array of doubles if the file is not 
	 * empty, returns a null if file is empty
	 * 
	 * @throws FileNotFoundException
	 */
	public static double[][] readFile(File file) throws FileNotFoundException
	{
		Scanner keyboard = new Scanner(file);
		for (int columnNum = 0; (columnNum < (dist5_array.length) && keyboard.hasNextDouble()); columnNum++) {//iterate thru column length 
			for(int rowNum = 0; (rowNum < (dist5_array[columnNum].length) && keyboard.hasNextDouble()); rowNum++) {//iterate thru row length
				System.out.println(dist5_array[columnNum][rowNum] = keyboard.nextDouble());
			}
		}
		return dist5_array;
		
	}
	
	/**
	 * Writes the ragged array of doubles into the file. Each row is on a separate 
	 * line within the file and each double is separated by a space.
	 * 
	 * @param data - two dimensional ragged array of doubles
	 * @param outputFile - the file to write to
	 * 
	 * @throws FileNotFoundException
	 */
	public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException
	{
		try {
			//FileWriter dataWriter = new FileWriter("district5_data.txt");
			FileOutputStream fileOut = new FileOutputStream(outputFile);
			DataOutputStream dataWriter = new DataOutputStream(fileOut);
			for (int columnNum = 0; (columnNum < (data.length)); columnNum++) {//iterate thru column length 
				for(int rowNum = 0; (rowNum < (data[columnNum].length)); rowNum++) {//iterate thru row length
					dataWriter.writeDouble(data[columnNum][rowNum]);//<-----implement code here
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Returns the total of all the elements of the two dimensional array
	 * 
	 * @param data - the two dimensional array to get the total of
	 * @return the sum of all the elements in the two dimensional array
	 */
	public static double getTotal(double[][] data)
	{
		return 0.0; //properly implement
	}
	
	/**
	 * Returns the average of the elements in the two dimensional array
	 * 
	 * @param data - the two dimensional array to get the average of
	 * @return the average of the elements in the two dimensional array (total of 
	 * elements/number of elements)
	 */
	public static double getAverage(double[][] data)
	{
		return 0.0; //properly implement
	}
	
	/**
	 * Returns the total of the selected row in the two 
	 * dimensional array index 0 refers to the first row.
	 * 
	 * @param data - the two dimensional array
	 * @param row - the row index to take the total of (0 refers to the first row)
	 * @return the total of the row
	 */
	public static double getRowTotal(double[][] data, int row) 
	{
		return 0.0; //properly implement
	}
	
	/**
	 * Returns the total of the selected column in the two 
	 * dimensional array index 0 refers to the first column. 
	 * If a row in the two dimensional array doesn't have this 
	 * column index, it is not an error, it doesn't participate in this method.
	 * 
	 * @param data - the two dimensional array
	 * @param col - the column index to take the total of 
	 * (0 refers to the first column)
	 * @return the total of the column
	 */
	public static double getColumnTotal(double[][] data, int col)
	{
		return 0.0; //properly implement
	}
	
	/**
	 * Returns the largest element of the selected row in the two 
	 * dimensional array index 0 refers to the first row.
	 * 
	 * @param data - the two dimensional array
	 * @param row - the row index to find the 
	 * largest element of (0 refers to the first row)
	 * @return the largest element of the row
	 */
	public static double getHighestInRow(double[][] data, int row)
	{
		return 0.0; //properly implement
	}
	
	/**
	 * Returns the largest element of the selected row in the two 
	 * dimensional array index 0 refers to the first row.
	 * 
	 * @param data - the two dimensional array
	 * @param row - the row index to find the 
	 * largest element of (0 refers to the first row)
	 * @return the largest element of the row
	 */
	public static int getHighestInRowIndex(double[][] data, int row)
	{
		return 0; //properly implement
	}
	
	/**
	 * Returns the smallest element of the selected row in the two 
	 * dimensional array index 0 refers to the first row.
	 * 
	 * @param data - the two dimensional array
	 * @param row - the row index to find the 
	 * smallest element of (0 refers to the first row)
	 * @return the smallest element of the row
	 */
	public static double getLowestInRow(double[][] data, int row)
	{
		return 0.0; //properly implement
	}
	
	/**
	 * Returns the index of the smallest element of the selected row in the two 
	 * dimensional array index 0 refers to the first row.
	 * 
	 * @param data - the two dimensional array
	 * @param row - the row index to find the 
	 * smallest element of (0 refers to the first row)
	 * @return the index of the smallest element of the row
	 */
	public static int getLowestInRowIndex(double[][] data, int row)
	{
		return 0; //properly implement
	}
	
	/**
	 * Returns the largest element of the selected column in the two 
	 * dimensional array index 0 refers to the first column. If a row 
	 * in the two dimensional array doesn't have this column index, it 
	 * is not an error, it doesn't participate in this method.
	 * 
	 * @param data - the two dimensional array
	 * @param col - the column index to find the 
	 * largest element of (0 refers to the first column)
	 * @return the largest element of the column
	 */
	public static double getHighestInColumn(double[][] data, int col)
	{
		return 0.0; //properly implement
	}
	
	/**
	 * Returns index of the largest element of the selected column in the two 
	 * dimensional array index 0 refers to the first column. If a row in the 
	 * two dimensional array doesn't have this column index, it is not an error, 
	 * it doesn't participate in this method.
	 * 
	 * @param data - the two dimensional array
	 * @param col - the column index to find the 
	 * largest element of (0 refers to the first column)
	 * @return the index of the largest element of the column
	 */
	public static int getHighestInColumnIndex(double[][] data, int col)
	{
		return 0; //properly implement
	}
	
	/**
	 * Returns the smallest element of the selected column in the two 
	 * dimensional array index 0 refers to the first column. If a row 
	 * in the two dimensional array doesn't have this column index, it 
	 * is not an error, it doesn't participate in this method.
	 * 
	 * @param data - the two dimensional array
	 * @param col - the column index to find the 
	 * smallest element of (0 refers to the first column)
	 * @return the smallest element of the column
	 */
	public static double getLowestInColumn(double[][] data, int col)
	{
		return 0.0; //properly implement
	}
	
	/**
	 * Returns the index of the smallest element of the selected column in the two 
	 * dimensional array index 0 refers to the first column. If a row in the two 
	 * dimensional array doesn't have this column index, it is not an error, it 
	 * doesn't participate in this method.
	 * 
	 * @param data - the two dimensional array
	 * @param col - the column index to find the 
	 * smallest element of (0 refers to the first column)
	 * @return the index of the smallest element of the column
	 */
	public static int getLowestInColumnIndex(double[][] data, int col)
	{
		return 0; //properly implement
	}
	
	/**
	 *Returns the largest element in the two dimensional array 
	 * 
	 * @param data - the two dimensional array
	 * @return the largest element in the two dimensional array
	 */
	public static double getHighestInArray(double[][] data)
	{
		return 0.0; //properly implement
	}
	
	/**
	 * Returns the smallest element in the two dimensional array
	 * 
	 * @param data - the two dimensional array
	 * @return the smallest element in the two dimensional array
	 */
	public static double getLowestInArray(double[][] data)
	{
		return 0.0; //properly implement
	}
}
