package org.example.model;

import java.time.LocalDate;
import java.util.Objects;

public class Job {
	
	private String id;
	private String name;
	private LocalDate start;
	private LocalDate end;
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public LocalDate getStart() {
		return start;
	}
	public LocalDate getEnd() {
		return end;
	}
	public void setEnd(LocalDate end) {
		this.end = end;
	}
	
	public Job(String id, String name, LocalDate start, LocalDate end) {
		super();
		this.id = id;
		this.name = name;
		this.start = start;
		this.end = end;
	}

	@Override
	public String toString() {
		return "JobItem{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", start=" + start +
				", end=" + end +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Job job = (Job) o;
		return Objects.equals(id, job.id) && Objects.equals(name, job.name) && Objects.equals(start, job.start) && Objects.equals(end, job.end);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, start, end);
	}
}
