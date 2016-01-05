package md51fd6eac3a1567202239773d411eb6833;


public class DefaultAnimation
	extends android.view.animation.Animation
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_applyTransformation:(FLandroid/view/animation/Transformation;)V:GetApplyTransformation_FLandroid_view_animation_Transformation_Handler\n" +
			"";
		mono.android.Runtime.register ("MaterialLoadingProgressbarCSharp.DefaultAnimation, MaterialLoadingProgressbarCSharp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", DefaultAnimation.class, __md_methods);
	}


	public DefaultAnimation () throws java.lang.Throwable
	{
		super ();
		if (getClass () == DefaultAnimation.class)
			mono.android.TypeManager.Activate ("MaterialLoadingProgressbarCSharp.DefaultAnimation, MaterialLoadingProgressbarCSharp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public DefaultAnimation (android.content.Context p0, android.util.AttributeSet p1) throws java.lang.Throwable
	{
		super (p0, p1);
		if (getClass () == DefaultAnimation.class)
			mono.android.TypeManager.Activate ("MaterialLoadingProgressbarCSharp.DefaultAnimation, MaterialLoadingProgressbarCSharp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}

	public DefaultAnimation (md51fd6eac3a1567202239773d411eb6833.MaterialProgressDrawale p0) throws java.lang.Throwable
	{
		super ();
		if (getClass () == DefaultAnimation.class)
			mono.android.TypeManager.Activate ("MaterialLoadingProgressbarCSharp.DefaultAnimation, MaterialLoadingProgressbarCSharp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "MaterialLoadingProgressbarCSharp.MaterialProgressDrawale, MaterialLoadingProgressbarCSharp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", this, new java.lang.Object[] { p0 });
	}


	public void applyTransformation (float p0, android.view.animation.Transformation p1)
	{
		n_applyTransformation (p0, p1);
	}

	private native void n_applyTransformation (float p0, android.view.animation.Transformation p1);

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
