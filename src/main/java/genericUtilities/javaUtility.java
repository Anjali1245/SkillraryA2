package genericUtilities;


import java.text.SimpleDateFormat;
import java.util.Date;

public class javaUtility {
	/**
	 * This method contains reusable methods to perform java related operations
	 * @author Singi
	 *
	 */
	public class JavaUtility {
		/**
		 * This method fetches current date and time in specified format
		 * @return
		 */
		public String getCurrentTime() {
			Date date = new Date();
		    SimpleDateFormat sdf=new SimpleDateFormat("dd_MM_yy_hh_mm_ss");
			return sdf.format(date);
			
		}

	}

	public String getCurrentTime() {
		// TODO Auto-generated method stub
		return null;
	}

}
