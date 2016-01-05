package materialloadingprogressbarcsharp;


public class OvalShadow
	extends android.graphics.drawable.shapes.OvalShape
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("MaterialLoadingProgressbarCSharp.OvalShadow, MaterialLoadingProgressbarCSharp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", OvalShadow.class, __md_methods);
	}


	public OvalShadow () throws java.lang.Throwable
	{
		super ();
		if (getClass () == OvalShadow.class)
			mono.android.TypeManager.Activate ("MaterialLoadingProgressbarCSharp.OvalShadow, MaterialLoadingProgressbarCSharp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public OvalShadow (int p0, int p1, materialloadingprogressbarcsharp.CircleProgressBar p2) throws java.lang.Throwable
	{
		super ();
		if (getClass () == OvalShadow.class)
			mono.android.TypeManager.Activate ("MaterialLoadingProgressbarCSharp.OvalShadow, MaterialLoadingProgressbarCSharp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:MaterialLoadingProgressbarCSharp.CircleProgressBar, MaterialLoadingProgressbarCSharp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", this, new java.lang.Object[] { p0, p1, p2 });
	}

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
