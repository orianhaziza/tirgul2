package threadArray;

import java.util.ArrayList;
/**a class that fix the whole data
 * 
 *
 */
public class SharedData 
{
	private ArrayList<Integer> array;;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/**
	 * a constructor for the class
	 * @param array an array
	 * @param b an object type int
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/**
	 * a method to return the winning array
	 * @return the winning array saved in winArray
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * a method to keep the winning array
	 * @param winArray the array that needs to be saved in this.winArray
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * a method to return array
	 * @return array
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**
	 * a method to return b
	 * @return b
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * a method to return flag
	 * @return flag
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * a method to set the flag
	 * @param flag the object that needs to be kept in flag
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
