package org.example;

import org.example.model.Calendar;
import org.example.model.Job;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JobConverterImpl implements JobConverter {

	private static Job job;

	public List<Job> conversion(List<Calendar> ci) {

		List<Job> jobs = new ArrayList<Job>();
		int size = 0;

		if(ci == null){
			return jobs;
		}

		for (int i = 0; i < ci.size(); i++) {

			processOneCalendarItem(ci.get(i), ci.size(), jobs, i);

			/*LocalDate d = null;
			JobItem j = null;
				if (i != ci.size()-1) {
					if (!(ci.get(i).getJobId().equalsIgnoreCase(ci.get(i+1).getJobId()))) {
						d = ci.get(i+1).getDatum().minusDays(1);
						if (i == ci.size()-1) {
							size = jobs.size();
							jobs.get(size - 1).setEnd(d);
						}
					}
				}
				if (!(ci.get(i).getJobId().equals(""))){
					j = new JobItem(ci.get(i).getJobId(), ci.get(i).getComment(), ci.get(i).getDatum(), d);
					jobs.add(j);
				}
				if(i == ci.size()-1)
					jobs.get(jobs.size()-1).setEnd(jobs.get(jobs.size()-1).getStart());*/
		}

		job = null;
		return jobs;

	}

	public static void processOneCalendarItem(Calendar calendar, int size, List<Job> jobs, int step) {

		LocalDate d = null;
		Job j;
		boolean lastStep = (step == size - 1);
		boolean firstStep = (step == 0);


		if (firstStep) {
			job = new Job(
					calendar.getJobId(),
					calendar.getComment(),
					calendar.getDatum(),
					d);
			jobs.add(job);
		}

		boolean jobChanged = job == null || job.getId() != calendar.getJobId();
		if (jobChanged) {

			if(job != null) {
				job.setEnd(calendar.getDatum().minusDays(1));
			}

			job = new Job(
					calendar.getJobId(),
					calendar.getComment(),
					calendar.getDatum(),
					d);

			jobs.add(job);

		}

		if (lastStep) {
			job.setEnd(calendar.getDatum());
		}
	}

}
