minimal-repo-tf-crashing
===

To reproduce, run:

```
sbt +test
```

and you should get:

```
[info] Loading settings from idea.sbt,plugins.sbt ...
[info] Loading global plugins from /Users/rav/.sbt/1.0/plugins
...
[info] Done compiling.
[info] HelloSpec:
[info] TF
[info] - should crash on cross test
[info] Run completed in 1 second, 132 milliseconds.
[info] Total number of tests run: 1
[info] Suites: completed 1, aborted 0
[info] Tests: succeeded 1, failed 0, canceled 0, ignored 0, pending 0
[info] All tests passed.
[success] Total time: 9 s, completed May 15, 2018 1:07:19 PM
[info] Setting Scala version to 2.12.6 on 1 projects.
...
[info] Done compiling.
2018-05-15 13:07:27.613314: F tensorflow/core/lib/monitoring/collection_registry.cc:77] Cannot register 2 metrics with the same name: /tensorflow/cc/saved_model/load_attempt_count
/usr/local/Cellar/sbt/1.1.4/libexec/bin/sbt-launch-lib.bash: line 58:  4252 Abort trap: 6           "$@"
```
