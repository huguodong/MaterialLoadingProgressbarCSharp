package md51fd6eac3a1567202239773d411eb6833;


public class MaterialProgressDrawale
	extends android.graphics.drawable.Drawable
	implements
		mono.android.IGCUserPeer,
		android.graphics.drawable.Animatable,
		android.view.animation.Animation.AnimationListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_getIntrinsicHeight:()I:GetGetIntrinsicHeightHandler\n" +
			"n_getIntrinsicWidth:()I:GetGetIntrinsicWidthHandler\n" +
			"n_draw:(Landroid/graphics/Canvas;)V:GetDraw_Landroid_graphics_Canvas_Handler\n" +
			"n_setAlpha:(I)V:GetSetAlpha_IHandler\n" +
			"n_setColorFilter:(Landroid/graphics/ColorFilter;)V:GetSetColorFilter_Landroid_graphics_ColorFilter_Handler\n" +
			"n_getOpacity:()I:GetGetOpacityHandler\n" +
			"n_isRunning:()Z:GetIsRunningHandler:Android.Graphics.Drawables.IAnimatableInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_start:()V:GetStartHandler:Android.Graphics.Drawables.IAnimatableInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_stop:()V:GetStopHandler:Android.Graphics.Drawables.IAnimatableInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onAnimationEnd:(Landroid/view/animation/Animation;)V:GetOnAnimationEnd_Landroid_view_animation_Animation_Handler:Android.Views.Animations.Animation/IAnimationListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onAnimationRepeat:(Landroid/view/animation/Animation;)V:GetOnAnimationRepeat_Landroid_view_animation_Animation_Handler:Android.Views.Animations.Animation/IAnimationListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onAnimationStart:(Landroid/view/animation/Animation;)V:GetOnAnimationStart_Landroid_view_animation_Animation_Handler:Android.Views.Animations.Animation/IAnimationListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("MaterialLoadingProgressbarCSharp.MaterialProgressDrawale, MaterialLoadingProgressbarCSharp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MaterialProgressDrawale.class, __md_methods);
	}


	public MaterialProgressDrawale () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MaterialProgressDrawale.class)
			mono.android.TypeManager.Activate ("MaterialLoadingProgressbarCSharp.MaterialProgressDrawale, MaterialLoadingProgressbarCSharp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public MaterialProgressDrawale (android.content.Context p0, android.view.View p1) throws java.lang.Throwable
	{
		super ();
		if (getClass () == MaterialProgressDrawale.class)
			mono.android.TypeManager.Activate ("MaterialLoadingProgressbarCSharp.MaterialProgressDrawale, MaterialLoadingProgressbarCSharp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Views.View, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public int getIntrinsicHeight ()
	{
		return n_getIntrinsicHeight ();
	}

	private native int n_getIntrinsicHeight ();


	public int getIntrinsicWidth ()
	{
		return n_getIntrinsicWidth ();
	}

	private native int n_getIntrinsicWidth ();


	public void draw (android.graphics.Canvas p0)
	{
		n_draw (p0);
	}

	private native void n_draw (android.graphics.Canvas p0);


	public void setAlpha (int p0)
	{
		n_setAlpha (p0);
	}

	private native void n_setAlpha (int p0);


	public void setColorFilter (android.graphics.ColorFilter p0)
	{
		n_setColorFilter (p0);
	}

	private native void n_setColorFilter (android.graphics.ColorFilter p0);


	public int getOpacity ()
	{
		return n_getOpacity ();
	}

	private native int n_getOpacity ();


	public boolean isRunning ()
	{
		return n_isRunning ();
	}

	private native boolean n_isRunning ();


	public void start ()
	{
		n_start ();
	}

	private native void n_start ();


	public void stop ()
	{
		n_stop ();
	}

	private native void n_stop ();


	public void onAnimationEnd (android.view.animation.Animation p0)
	{
		n_onAnimationEnd (p0);
	}

	private native void n_onAnimationEnd (android.view.animation.Animation p0);


	public void onAnimationRepeat (android.view.animation.Animation p0)
	{
		n_onAnimationRepeat (p0);
	}

	private native void n_onAnimationRepeat (android.view.animation.Animation p0);


	public void onAnimationStart (android.view.animation.Animation p0)
	{
		n_onAnimationStart (p0);
	}

	private native void n_onAnimationStart (android.view.animation.Animation p0);

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
