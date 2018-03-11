package com.staticinfo.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.staticinfo.R;


public class RightFragment extends Fragment {
	private ImageView imageView;

	// 创建Fragment要展示的布局效果
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.right_fragment, null);
		imageView = (ImageView) view.findViewById(R.id.imageView);
		return view;
	}

	/**
	 * 提供一个设置图片的方法
	 * 
	 * @param i
	 */
	public void setCurrentImage(int i) {
		imageView.setImageResource(i);
	}
}
