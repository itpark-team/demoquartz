package com.example.demoquartz.controllers;

import com.example.demoquartz.service.JobsService;
import lombok.AllArgsConstructor;
import org.quartz.SchedulerException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jobs")
@AllArgsConstructor
public class JobsController {

    private JobsService jobsService;

    @GetMapping("/run")
    public void run() throws SchedulerException {
        jobsService.run();
    }
}
