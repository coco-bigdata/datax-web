python datax.py ../job/job.json

DataX (DATAX-OPENSOURCE-3.0), From Alibaba !
Copyright (C) 2010-2017, Alibaba Group. All Rights Reserved.


2021-07-19 18:18:31.420 [main] INFO  VMInfo - VMInfo# operatingSystem class => sun.management.OperatingSystemImpl
2021-07-19 18:18:31.428 [main] INFO  Engine - the machine info  =>

        osInfo: Red Hat, Inc. 1.8 25.282-b08
        jvmInfo:        Linux amd64 3.10.0-1160.11.1.el7.x86_64
        cpu num:        4

        totalPhysicalMemory:    -0.00G
        freePhysicalMemory:     -0.00G
        maxFileDescriptorCount: -1
        currentOpenFileDescriptorCount: -1

        GC Names        [PS MarkSweep, PS Scavenge]

        MEMORY_NAME                    | allocation_size                | init_size
        PS Eden Space                  | 256.00MB                       | 256.00MB
        Code Cache                     | 240.00MB                       | 2.44MB
        Compressed Class Space         | 1,024.00MB                     | 0.00MB
        PS Survivor Space              | 42.50MB                        | 42.50MB
        PS Old Gen                     | 683.00MB                       | 683.00MB
        Metaspace                      | -0.00MB                        | 0.00MB


2021-07-19 18:18:31.447 [main] INFO  Engine -
{
"content":[
{
"reader":{
"name":"streamreader",
"parameter":{
"column":[
{
"type":"string",
"value":"DataX"
},
{
"type":"long",
"value":19890604
},
{
"type":"date",
"value":"1989-06-04 00:00:00"
},
{
"type":"bool",
"value":true
},
{
"type":"bytes",
"value":"test"
}
],
"sliceRecordCount":100000
}
},
"writer":{
"name":"streamwriter",
"parameter":{
"encoding":"UTF-8",
"print":false
}
}
}
],
"setting":{
"errorLimit":{
"percentage":0.02,
"record":0
},
"speed":{
"byte":10485760
}
}
}

2021-07-19 18:18:31.465 [main] WARN  Engine - prioriy set to 0, because NumberFormatException, the value is: null
2021-07-19 18:18:31.466 [main] INFO  PerfTrace - PerfTrace traceId=job_-1, isEnable=false, priority=0
2021-07-19 18:18:31.466 [main] INFO  JobContainer - DataX jobContainer starts job.
2021-07-19 18:18:31.468 [main] INFO  JobContainer - Set jobId = 0
2021-07-19 18:18:31.483 [job-0] INFO  JobContainer - jobContainer starts to do prepare ...
2021-07-19 18:18:31.483 [job-0] INFO  JobContainer - DataX Reader.Job [streamreader] do prepare work .
2021-07-19 18:18:31.483 [job-0] INFO  JobContainer - DataX Writer.Job [streamwriter] do prepare work .
2021-07-19 18:18:31.484 [job-0] INFO  JobContainer - jobContainer starts to do split ...
2021-07-19 18:18:31.484 [job-0] INFO  JobContainer - Job set Max-Byte-Speed to 10485760 bytes.
2021-07-19 18:18:31.485 [job-0] INFO  JobContainer - DataX Reader.Job [streamreader] splits to [1] tasks.
2021-07-19 18:18:31.485 [job-0] INFO  JobContainer - DataX Writer.Job [streamwriter] splits to [1] tasks.
2021-07-19 18:18:31.507 [job-0] INFO  JobContainer - jobContainer starts to do schedule ...
2021-07-19 18:18:31.512 [job-0] INFO  JobContainer - Scheduler starts [1] taskGroups.
2021-07-19 18:18:31.514 [job-0] INFO  JobContainer - Running by standalone Mode.
2021-07-19 18:18:31.530 [taskGroup-0] INFO  TaskGroupContainer - taskGroupId=[0] start [1] channels for [1] tasks.
2021-07-19 18:18:31.533 [taskGroup-0] INFO  Channel - Channel set byte_speed_limit to -1, No bps activated.
2021-07-19 18:18:31.534 [taskGroup-0] INFO  Channel - Channel set record_speed_limit to -1, No tps activated.
2021-07-19 18:18:31.545 [taskGroup-0] INFO  TaskGroupContainer - taskGroup[0] taskId[0] attemptCount[1] is started
2021-07-19 18:18:31.846 [taskGroup-0] INFO  TaskGroupContainer - taskGroup[0] taskId[0] is successed, used[302]ms
2021-07-19 18:18:31.847 [taskGroup-0] INFO  TaskGroupContainer - taskGroup[0] completed it's tasks.
2021-07-19 18:18:41.539 [job-0] INFO  StandAloneJobContainerCommunicator - Total 100000 records, 2600000 bytes | Speed 253.91KB/s, 10000 records/s | Error 0 records, 0 bytes |  All Task WaitWriterTime 0.040s |  All Task WaitReaderTime 0.053s | Percentage 100.00%
2021-07-19 18:18:41.540 [job-0] INFO  AbstractScheduler - Scheduler accomplished all tasks.
2021-07-19 18:18:41.540 [job-0] INFO  JobContainer - DataX Writer.Job [streamwriter] do post work.
2021-07-19 18:18:41.540 [job-0] INFO  JobContainer - DataX Reader.Job [streamreader] do post work.
2021-07-19 18:18:41.540 [job-0] INFO  JobContainer - DataX jobId [0] completed successfully.
2021-07-19 18:18:41.541 [job-0] INFO  HookInvoker - No hook invoked, because base dir not exists or is a file: /home/zhangchunsheng/git/datax/hook
2021-07-19 18:18:41.542 [job-0] INFO  JobContainer -
[total cpu info] =>
averageCpu                     | maxDeltaCpu                    | minDeltaCpu
-1.00%                         | -1.00%                         | -1.00%


         [total gc info] =>
                 NAME                 | totalGCCount       | maxDeltaGCCount    | minDeltaGCCount    | totalGCTime        | maxDeltaGCTime     | minDeltaGCTime
                 PS MarkSweep         | 0                  | 0                  | 0                  | 0.000s             | 0.000s             | 0.000s

                 PS Scavenge          | 0                  | 0                  | 0                  | 0.000s             | 0.000s             | 0.000s


2021-07-19 18:18:41.542 [job-0] INFO  JobContainer - PerfTrace not enable!
2021-07-19 18:18:41.542 [job-0] INFO  StandAloneJobContainerCommunicator - Total 100000 records, 2600000 bytes | Speed 253.91KB/s, 10000 records/s | Error 0 records, 0 bytes |  All Task WaitWriterTime 0.040s |  All Task WaitReaderTime 0.053s | Percentage 100.00%
2021-07-19 18:18:41.543 [job-0] INFO  JobContainer -
任务启动时刻                    : 2021-07-19 18:18:31
任务结束时刻                    : 2021-07-19 18:18:41
任务总计耗时                    :                 10s
任务平均流量                    :          253.91KB/s
记录写入速度                    :          10000rec/s
读出记录总数                    :              100000
读写失败总数                    :                   0