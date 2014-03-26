package in.suraj.timetableswipe;

import java.util.Calendar;

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
public class TYFragment extends Fragment {

	TextView tvLect1Name, tvLect1Prof;
	TextView tvLect2Name, tvLect2Prof;
	TextView tvLect3Name, tvLect3Prof;
	TextView tvLect4Name, tvLect4Prof;
	TextView tvLect5Name, tvLect5Prof;
	ScrollView sc;

	RadioButton rbMon, rbTue, rbWed, rbThur, rbFri;
	RadioGroup rgroup;

	public View rootView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		rootView = inflater.inflate(R.layout.fragment_ty, container, false);

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

		} else if (Calendar.SUNDAY == dayOfWeek) {

		}
	}

	private void setUpMonday() {
		rbMon.toggle();
		tvLect1Name.setText("-");
		tvLect1Prof.setText("-");

		tvLect2Name.setText("COA");
		tvLect2Prof.setText("MVV");

		tvLect3Name.setText("TCP IP");
		tvLect3Prof.setText("GKP");

		tvLect4Name.setText("CA");
		tvLect4Prof.setText("BSS");

		tvLect5Name.setText("A-CL4\nB-TCP IP\nC-CA\nD-DSP");
		tvLect5Prof.setText("A-ASB\nB-GKP\nC-BSS\nD-SRP");

	}

	private void setUpTuesday() {
		rbTue.toggle();
		tvLect1Name.setText("-");
		tvLect1Prof.setText("-");

		tvLect2Name.setText("TCP IP");
		tvLect2Prof.setText("GKP");

		tvLect3Name.setText("CT");
		tvLect3Prof.setText("CPN");

		tvLect4Name.setText("CA");
		tvLect4Prof.setText("BSS");

		tvLect5Name.setText("B-CL4\nC-TCP IP\nD-CA\nA-DSP");
		tvLect5Prof.setText("B-ASB\nC-GKP\nD-BSS\nA-SRP");

	}

	private void setUpWednesday() {
		rbWed.toggle();
		tvLect1Name.setText("-");
		tvLect1Prof.setText("-");

		tvLect2Name.setText("DSP");
		tvLect2Prof.setText("SRP");

		tvLect3Name.setText("TCP IP");
		tvLect3Prof.setText("GKP");

		tvLect4Name.setText("CO");
		tvLect4Prof.setText("MVV");

		tvLect5Name.setText("C-CL4\nD-TCP IP\nA-CA\nB-DSP");
		tvLect5Prof.setText("C-ASB\nD-GKP\nA-BSS\nB-SRP");

	}

	private void setUpThursday() {
		rbThur.toggle();
		tvLect1Name.setText("DSP");
		tvLect1Prof.setText("SRP");

		tvLect2Name.setText("CT");
		tvLect2Prof.setText("CPN");

		tvLect3Name.setText("CO");
		tvLect3Prof.setText("MVV");

		tvLect4Name.setText("CA");
		tvLect4Prof.setText("BSS");

		tvLect5Name.setText("D-CL4\nA-TCP IP\nB-CA\nC-DSP");
		tvLect5Prof.setText("D-ASB\nA-GKP\nB-BSS\nC-SRP");

	}

	private void setUpFriday() {
		rbFri.toggle();

		tvLect1Name.setText("DSP");
		tvLect1Prof.setText("SRP");

		tvLect2Name.setText("CT");
		tvLect2Prof.setText("CPN");

		tvLect3Name.setText("Seminar");
		tvLect3Prof.setText("-");

		tvLect4Name.setText("Seminar");
		tvLect4Prof.setText("-");

		tvLect5Name.setText("-");
		tvLect5Prof.setText("-");

	}

}
