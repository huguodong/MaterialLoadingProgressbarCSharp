package materialloadingprogressbarcsharp;


public class EndCurveInterpolator
	extends android.view.animation.AccelerateDecelerateInterpolator
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_getInterpolation:(F)F:GetGetInterpolation_FHandler\n" +
			"";
		mono.android.Runtime.register ("MaterialLoadingProgressbarCSharp.EndCurveInterpolator, MaterialLoadingProgressbarCSharp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", EndCurveInterpolator.class, __md_methods);
	}


	public EndCurveInterpolator () throws java.lang.Throwable
	{
		super ();
		if (getClass () == EndCurveInterpolator.class)
			mono.android.TypeManager.Activate ("MaterialLoadingProgressbarCSharp.EndCurveInterpolator, MaterialLoadingProgressbarCSharp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public EndCurveInterpolator (android.content.Context p0, android.util.AttributeSet p1) throws java.lang.Throwable
	{
		super (p0, p1);
		if (getClass () == EndCurveInterpolator.class)
			mono.android.TypeManager.Activate ("MaterialLoadingProgressbarCSharp.EndCurveInterpolator, MaterialLoadingProgressbarCSharp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public float getInterpolation (float p0)
	{
		return n_getInterpolation (p0);
	}

	private native float n_getInterpolation (float p0);

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
