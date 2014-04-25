Counter.S.C
===========
This is a follow up on improving my first assignment in my CMPUT301 Class

LEARNING OBJECTIVE
=====================

Solve a problem by constructing a simple interactive application using Android and Java.
Document an object-oriented design in Unified Modeling Language.
Problem Description

You are to design and implement a simple, attractive, and easy-to-use counter application (like those clickers you click with your thumb to make sure the stadium or concert isn't overfull) that can count multiple custom things (like push-ups and situps) and provide statistics about these counters per day, per week, per month. You app will allow:

    Adding or removing of counters (counters are types such as sit-ups, push-ups, black sheep, white sheep, etc.)
    Incrementing of counters
    Summarizing counters by frequency (per minute, per hour, per day, per week, per month)
    Incrementing a counter records:
        *The counter incremented
        *The time
        
Your application must be persistent: if I exit the app it must remember everything that I did. If the app has to shutdown, it must have already saved my counters and counts.

This is a counter application meant for fast counting. It is assumed that the user will be counting more than browsing/summarzing counts (so incrementing a count should be EASY).

The application allows the user to:

    view counters
    view counts of counters
    add a new counter
    increment a counter
    remove a counter
    edit a counter (rename it)
    reset a counter (zero it)
    order counters by total count
    Summarize counts by time period. Provide a scrollable list of counter counts over time aggregated by:
        *counts per hour
        **Only hours that had a count, if Jan 12 11:00AM had 10 counts provide something like:
        ***Jan 12 11:00AM -- 10
        
        *counts per day
        **Only day that had a count, if Jan 12 11:00AM had 10 counts provide something like:
        ***Jan 12 -- 10
      
        *counts per week
        **Only week that had a count, if Jan 12 11:00AM had 10 counts provide something like:
        ***Week of Jan 12 -- 10
        
        *counts per month
        **Only week that had a count, if Jan 12 11:00AM had 10 counts provide something like:
        ***Month of Jan -- 10
        
    See count summaries per counter
    always save and load the log automatically for the user
    
Naturally, the statistics should be updated if counts change.
The application should assist the user in proper and consistent data entry.
