# Data Collector Template

This repository is a template to data collectors with metadata integration.

To use it, there are some application properties needed to be set:
* `spring.application.name`: Rename it to match your application
* `metadata.config.path`: The metadata json config file path. It is not required. 
If set, the application will try to config it on boot with the metadata service.
* `collector.id`: This will be used as a key to the metadata service.