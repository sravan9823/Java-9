package com.sravanit;

import java.io.IOException;
import java.util.Optional;
import java.util.stream.Stream;

public class ProcessAPIChanges {

	public static void main(String[] args) {

		Optional<ProcessHandle> ph = ProcessHandle.of(4820);

		if (ph.isPresent()) {
			ProcessHandle processHandle = ph.get();
			System.out.println(processHandle.isAlive());
			System.out.println(processHandle.info().startInstant());
			System.out.println(processHandle.info().user());

			processHandle.destroy();
		}

		Stream<ProcessHandle> processes = ProcessHandle.allProcesses();

		processes.forEach(process -> {
			if (process.isAlive())
				System.out.println("PID " + process.pid() + " info " + process.info());
		});

		ProcessBuilder processBuilder = new ProcessBuilder("notepad.exe");

		try {
			processBuilder.start();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
