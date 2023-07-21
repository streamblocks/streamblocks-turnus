package adevs;
import java.util.Collection;

/**
 * This interface is implemented by atomic DEVS models.
 * The model's constructor should place it
 * into its initial state.
 */
public abstract class Atomic<X> extends Devs
{
	/// Constructor should set the initial state
	public Atomic() { super(true); }
	/// Internal transition function 
	public abstract void delta_int();
	/**
	 * External transition function
	 *
	 * @param e	Time elapsed since the last change of state
	 * @param xb Collection containing the model's input
	 */
	public abstract void delta_ext(double e, Collection<X> xb);
	/**
	 * Confluenct transition function
	 *
	 * @param xb Collection containing the model's input
	 */
	public abstract void delta_conf(Collection<X> xb);
	/**
	 * The output function must fill the Collection yb with the model's output.
	 *
	 * @param yb	An empty Collection to be filled with output from the model
	 */
	public abstract void output_func(Collection<X> yb);
	/**
	 * Time advance. Use Double.MAX_VALUE for infinity.
	 */
	public abstract double ta();
}
