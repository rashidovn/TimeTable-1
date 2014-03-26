package in.suraj.timetableswipe.adapter;

import in.suraj.timetableswipe.BTechFragment;
import in.suraj.timetableswipe.SYFragment;
import in.suraj.timetableswipe.TYFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
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
public class TabsPagerAdapter extends FragmentPagerAdapter {

	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {
		switch (index) {
		case 0:
			return new SYFragment();
		case 1:
			return new TYFragment();
		case 2:
			return new BTechFragment();

		}
		return null;
	}

	@Override
	public int getCount() {
		return 3;
	}

}
