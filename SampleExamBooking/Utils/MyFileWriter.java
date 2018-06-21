package SampleExamBooking.Utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import SampleExamBooking.Provided.IFormatter;

public class MyFileWriter<T> {

	/**
	 * The format in which data is written to file. Cannot be null.
	 */
	private IFormatter<T> format;
	
	/**
	 * The underlying stream. Cannot be null.
	 */
	private FileWriter out;
	
	
	//Constructor
	public MyFileWriter() {
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * Constructs a MyFileWriter with a specific target file and format. 
	 * In case null objects are passed to this constructor IllegalArgumentException is thrown.
	 * @param file
	 * @param format
	 */
	public MyFileWriter(FileWriter file, IFormatter<T> format) {
		
		if(file != null && format != null) {
			System.out.print(file.toString());
			this.out = file;
			this.format = format;
		}else throw new IllegalArgumentException();
	}
	
	
	/**
	 * Writes a single object to the underlying file.
	The object passed to this method is written to file in the format of this MyFileWriter.
	A newline character is appended at the end of data. 
	This method handles all IOExceptions that might occur, 
	prints the error's stack trace, and returns false in such a case.
	 * @param t
	 * @return
	 */
	public final boolean put(T t) {
		
		if(out != null && t != null){
		
			try {
				BufferedWriter myBufferedWriter = new BufferedWriter(out);
				myBufferedWriter.write(format.format(t));
				myBufferedWriter.write("\n");
				myBufferedWriter.close();	
				return true;
			} catch(IOException e) {
				e.printStackTrace();
				return false;
			}
		
		}return false;
	}
	
	
}
