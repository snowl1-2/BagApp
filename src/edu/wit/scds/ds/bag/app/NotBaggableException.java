/* @formatter:off
 *
 * © David M Rosenberg
 *
 * Topic: Bag App ~ Grocery Bagger
 *
 * Usage restrictions:
 *
 * You may use this code for exploration, experimentation, and furthering your
 * learning for this course. You may not use this code for any other
 * assignments, in my course or elsewhere, without explicit permission, in
 * advance, from myself (and the instructor of any other course).
 *
 * Further, you may not post (including in a public repository such as on github)
 * nor otherwise share this code with anyone other than current students in my
 * sections of this course.
 *
 * Violation of these usage restrictions will be considered a violation of
 * Wentworth Institute of Technology's Academic Honesty Policy.  Unauthorized posting
 * or use of this code may also be considered copyright infringement and may subject
 * the poster and/or the owners/operators of said websites to legal and/or financial
 * penalties.  Students are permitted to store this code in a private repository
 * or other private cloud-based storage.
 *
 * Do not modify or remove this notice.
 *
 * @formatter:on
 */


package edu.wit.scds.ds.bag.app ;

/**
 * Exception indicating that a {@code GroceryItem} can't be added to any
 * {@code GroceryBag}
 *
 * @author David M Rosenberg
 *
 * @version 1.0 2017-05-23 Initial implementation
 * @version 1.1 2024-02-10 change from checked to unchecked exception
 */
public class NotBaggableException extends RuntimeException
    {

    // make this exception safely serializable
    private static final long serialVersionUID = 1L ;


    /**
     * Generic message
     */
    public NotBaggableException()
        {

        super( "This grocery item is not baggable" ) ;

        } // end no-arg constructor


    /**
     * Specified message
     *
     * @param message
     *     application message to include with exception
     */
    public NotBaggableException( final String message )
        {

        super( "This grocery item is not baggable: " + message ) ;

        } // end 1-arg constructor


    /**
     * Test driver
     *
     * @param args
     *     -unused-
     */
    public static void main( final String[] args )
        {

        // default message
        NotBaggableException testException = new NotBaggableException() ;
        System.out.println( testException.getMessage() ) ;

        // specified message
        testException = new NotBaggableException( "dog food" ) ;
        System.out.println( testException.getMessage() ) ;

        }   // end main()

    }   // end class NotBaggableException