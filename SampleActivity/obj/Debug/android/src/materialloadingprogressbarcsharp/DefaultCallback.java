package materialloadingprogressbarcsharp;


public class DefaultCallback
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.graphics.drawable.Drawable.Callback
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_invalidateDrawable:(Landroid/graphics/drawable/Drawable;)V:GetInvalidateDrawable_Landroid_graphics_drawable_Drawable_Handler:Android.Graphics.Drawables.Drawable/ICallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_scheduleDrawable:(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V:GetScheduleDrawable_Landroid_graphics_drawable_Drawable_Ljava_lang_Runnable_JHandler:Android.Graphics.Drawables.Drawable/ICallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_unscheduleDrawable:(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V:GetUnscheduleDrawable_Landroid_graphics_drawable_Drawable_Ljava_lang_Runnable_Handler:Android.Graphics.Drawables.Drawable/ICallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("MaterialLoadingProgressbarCSharp.DefaultCallback, MaterialLoadingProgressbarCSharp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", DefaultCallback.class, __md_methods);
	}


	public DefaultCallback () throws java.lang.Throwable
	{
		super ();
		if (getClass () == DefaultCallback.class)
			mono.android.TypeManager.Activate ("MaterialLoadingProgressbarCSharp.DefaultCallback, MaterialLoadingProgressbarCSharp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public DefaultCallback (materialloadingprogressbarcsharp.MaterialProgressDrawale p0) throws java.lang.Throwable
	{
		super ();
		if (getClass () == DefaultCallback.class)
			mono.android.TypeManager.Activate ("MaterialLoadingProgressbarCSharp.DefaultCallback, MaterialLoadingProgressbarCSharp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "MaterialLoadingProgressbarCSharp.MaterialProgressDrawale, MaterialLoadingProgressbarCSharp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", this, new java.lang.Object[] { p0 });
	}


	public void invalidateDrawable (android.graphics.drawable.Drawable p0)
	{
		n_invalidateDrawable (p0);
	}

	private native void n_invalidateDrawable (android.graphics.drawable.Drawable p0);


	public void scheduleDrawable (android.graphics.drawable.Drawable p0, java.lang.Runnable p1, long p2)
	{
		n_scheduleDrawable (p0, p1, p2);
	}

	private native void n_scheduleDrawable (android.graphics.drawable.Drawable p0, java.lang.Runnable p1, long p2);


	public void unscheduleDrawable (android.graphics.drawable.Drawable p0, java.lang.Runnable p1)
	{
		n_unscheduleDrawable (p0, p1);
	}

	private native void n_unscheduleDrawable (android.graphics.drawable.Drawable p0, java.lang.Runnable p1);

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
