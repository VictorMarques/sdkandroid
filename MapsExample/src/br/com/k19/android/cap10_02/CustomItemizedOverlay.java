package br.com.k19.android.cap10_02;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.drawable.Drawable;


public class CustomItemizedOverlay extends ItemizedOverlay<OverlayItem> {
	
	private ArrayList<OverlayItem> mOverlays = new ArrayList<OverlayItem>();
	private Context context;
	public CustomItemizedOverlay(Context context, Drawable dafaultMarker){
		super(boundCenterBottom(defaultMarker));
		this.context = context;
		}
	
	public void addOverlay(OverlayItem overlay){
		mOverlays.add(overlay);
		populate();
	}
	
	@Override
	protected OverlayItem createItem(int i){
		return mOverlays.get(i);
	}

}
