package in.suraj.timetableswipe;

import java.util.Calendar;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * 
 * @author Suraj Patil, email: srjptl2050@gmail.com
 * 
 *         Copyright 2013-2014 Suraj Patil
 * 
 *         Licensed under the Apache License, Version 2.0 (the "License"); you
 *         may not use this file except in compliance with the License. You may
 *         obtain a copy of the License at
 * 
 *         http://www.apache.org/licenses/LICENSE-2.0
 * 
 *         Unless required by applicable law or agreed to in writing, software
 *         distributed under the License is distributed on an "AS IS" BASIS,
 *         WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *         implied. See the License for the specific language governing
 *         permissions and limitations under the License.
 */
public class BTechFragment extends Fragment {
	// TODO make the curren lecture green background
	// add remainder
	TextView tvLect1Name, tvLect1Prof;
	TextView tvLect2Name, tvLect2Prof;
	TextView tvLect3Name, tvLect3Prof;
	TextView tvLect4Name, tvLect4Prof;
	TextView tvLect5Name, tvLect5Prof;

	ScrollView sc;

	public View rootView;
	RadioButton rbMon, rbTue, rbWed, rbThur, rbFri;
	RadioGroup rgroup;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		rootView = inflater.inflate(R.layout.fragment_final, container, false);
		init();
		initRadioButton();
		return rootView;
	}

	private void initRadioButton() {

		rbMon.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				setUpMonday();
			}

		});

		rbTue.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				setUpTuesday();
			}

		});

		rbWed.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				setUpWednesday();
			}

		});

		rbThur.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				setUpThursday();
			}

		});

		rbFri.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				setUpFriday();
			}

		});
	}

	protected void setUpFriday() {
		rbFri.toggle();
		tvLect1Name.setText("-");
		tvLect1Prof.setText("-");

		tvLect2Name.setText("ECOM");
		tvLect2Prof.setText("GKP");

		tvLect3Name.setText("MS");
		tvLect3Prof.setText("RSP");

		tvLect4Name.setText("ELE-II");
		tvLect4Prof.setText("JVM");

		tvLect5Name.setText("HPC");
		tvLect5Prof.setText("KH");

	}

	protected void setUpThursday() {
		rbThur.toggle();
		tvLect1Name.setText("D-Ele\nA-ECOM\nB-MWC\nC-MS");
		tvLect1Prof.setText("D-KH\nA-CPN\nB-AKM\nC-RSP");

		tvLect2Name.setText("ECOM");
		tvLect2Prof.setText("GKP");

		tvLect3Name.setText("MS");
		tvLect3Prof.setText("RSP");

		tvLect4Name.setText("HPC");
		tvLect4Prof.setText("KH");

		tvLect5Name.setText("-");
		tvLect5Prof.setText("-");

	}

	protected void setUpWednesday() {
		rbWed.toggle();
		tvLect1Name.setText("C-Ele\nD-ECOM\nB-MWC\nA-MS");
		tvLect1Prof.setText("C-KH\nD-CPN\nB-AKM\nA-RSP");

		tvLect2Name.setText("MWC");
		tvLect2Prof.setText("AKM");

		tvLect3Name.setText("HPC");
		tvLect3Prof.setText("KH");

		tvLect4Name.setText("ECOM");
		tvLect4Prof.setText("GKP");

		tvLect5Name.setText("-");
		tvLect5Prof.setText("-");

	}

	protected void setUpTuesday() {
		rbTue.toggle();
		tvLect1Name.setText("B-Ele\nC-ECOM\nD-MWC\nA-MS");
		tvLect1Prof.setText("B-KH\nC-CPN\nD-AKM\nA-RSP");

		tvLect2Name.setText("MS");
		tvLect2Prof.setText("RSP");

		tvLect3Name.setText("MWC");
		tvLect3Prof.setText("AKM");

		tvLect4Name.setText("-");
		tvLect4Prof.setText("-");

		tvLect5Name.setText("-");
		tvLect5Prof.setText("-");

	}

	protected void setUpMonday() {
		rbMon.toggle();
		tvLect1Name.setText("A-Ele\nB-ECOM\nC-MWC\nD-MS");
		tvLect1Prof.setText("A-KH\nB-CPN\nC-AKM\nD-RSP");

		tvLect2Name.setText("MWC");
		tvLect2Prof.setText("AKM");

		tvLect3Name.setText("ELE-II");
		tvLect3Prof.setText("JVM");

		tvLect4Name.setText("-");
		tvLect4Prof.setText("-");

		tvLect5Name.setText("-");
		tvLect5Prof.setText("-");

	}

	private void init() {
		rgroup = (RadioGroup) rootView.findViewById(R.id.rbgrp);
		rbMon = (RadioButton) rootView.findViewById(R.id.rbMon);
		rbTue = (RadioButton) rootView.findViewById(R.id.rbTue);
		rbWed = (RadioButton) rootView.findViewById(R.id.rbWed);
		rbThur = (RadioButton) rootView.findViewById(R.id.rbThur);
		rbFri = (RadioButton) rootView.findViewById(R.id.rbFri);

		tvLect1Name = (TextView) rootView.findViewById(R.id.tvLect1Name);
		tvLect1Prof = (TextView) rootView.findViewById(R.id.tvLect1Prof);

		tvLect2Name = (TextView) rootView.findViewById(R.id.tvLect2Name);
		tvLect2Prof = (TextView) rootView.findViewById(R.id.tvLect2Prof);

		tvLect3Name = (TextView) rootView.findViewById(R.id.tvLect3Name);
		tvLect3Prof = (TextView) rootView.findViewById(R.id.tvLect3Prof);

		tvLect4Name = (TextView) rootView.findViewById(R.id.tvLect4Name);
		tvLect4Prof = (TextView) rootView.findViewById(R.id.tvLect4Prof);

		tvLect5Name = (TextView) rootView.findViewById(R.id.tvLect5Name);
		tvLect5Prof = (TextView) rootView.findViewById(R.id.tvLect5Prof);

		Calendar c = Calendar.getInstance();
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

		if (Calendar.MONDAY == dayOfWeek) {
			setUpMonday();
		} else if (Calendar.TUESDAY == dayOfWeek) {
			setUpTuesday();
		} else if (Calendar.WEDNESDAY == dayOfWeek) {
			setUpWednesday();
		} else if (Calendar.THURSDAY == dayOfWeek) {
			setUpThursday();
		} else if (Calendar.FRIDAY == dayOfWeek) {
			setUpFriday();
		} else if (Calendar.SATURDAY == dayOfWeek) {
			tvLect1Name.setText("Saturday :)");
			tvLect1Name.setTextColor(Color.RED);
		} else if (Calendar.SUNDAY == dayOfWeek) {
			tvLect1Name.setText("Sunday :)");
			tvLect1Name.setTextColor(Color.RED);
		}
	}
}
