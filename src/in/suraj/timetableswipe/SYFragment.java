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
public class SYFragment extends Fragment {

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

		rootView = inflater.inflate(R.layout.fragment_sy, container, false);
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

	private void setUpTuesday() {
		rbTue.toggle();
		rbTue.setSelected(true);
		tvLect1Name.setText("CL-II");
		tvLect1Prof.setText("BSS");

		tvLect2Name.setText("DM");
		tvLect2Prof.setText("ASB");

		tvLect3Name.setText("B-MP\nC-CJ\nD-CS\nA-CL2");
		tvLect3Prof.setText("B-MVV\nC-AA\nD-CSF\nA-KH");

		tvLect4Name.setText("CJ");
		tvLect4Prof.setText("AA");

		tvLect5Name.setText("-");
		tvLect5Prof.setText("-");

	}

	private void setUpWednesday() {
		rbWed.toggle();
		rbWed.setSelected(true);
		tvLect1Name.setText("M-IV");
		tvLect1Prof.setText("-");

		tvLect2Name.setText("DM");
		tvLect2Prof.setText("ASB");

		tvLect3Name.setText("C-MP\nD-CJ\nA-CS\nB-CL2");
		tvLect3Prof.setText("C-MVV\nD-AA\nA-CSF\nB-KH");

		tvLect4Name.setText("IS");
		tvLect4Prof.setText("RSP");

		tvLect5Name.setText("-");
		tvLect5Prof.setText("-");

	}

	private void setUpThursday() {
		rbThur.toggle();
		rbThur.setSelected(true);

		tvLect1Name.setText("M-IV");
		tvLect1Prof.setText("-");

		tvLect2Name.setText("DM");
		tvLect2Prof.setText("ASB");

		tvLect3Name.setText("D-MP\nA-CJ\nB-CS\nC-CL2");
		tvLect3Prof.setText("D-MVV\nA-AA\nB-CSF\nC-KH");

		tvLect4Name.setText("MP");
		tvLect4Prof.setText("JVM");

		tvLect5Name.setText("-");
		tvLect5Prof.setText("-");

	}

	private void setUpFriday() {
		rbFri.toggle();
		rbFri.setSelected(true);
		tvLect1Name.setText("M-IV");
		tvLect1Prof.setText(" ");

		tvLect2Name.setText("IS");
		tvLect2Prof.setText("RSP");

		tvLect3Name.setText("CL-II");
		tvLect3Prof.setText("BSS");

		tvLect4Name.setText("MP");
		tvLect4Prof.setText("JVM");

		tvLect5Name.setText("CJ");
		tvLect5Prof.setText("AA");

	}

	private void setUpMonday() {
		rbMon.toggle();
		tvLect1Name.setText("M-IV");
		tvLect1Prof.setText("-");

		tvLect2Name.setText("MP");
		tvLect2Prof.setText("JVM");

		tvLect3Name.setText("A-MP\nB-CJ\nC-CS\nD-CL2");
		tvLect3Prof.setText("A-MVV\nB-AA\nC-CSF\nD-KH");

		tvLect4Name.setText("IS");
		tvLect4Prof.setText("RSP");

		tvLect5Name.setText("CJ");
		tvLect5Prof.setText("AA");

	}
}
