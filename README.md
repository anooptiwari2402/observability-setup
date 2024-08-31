# <u> Observability Setup </u>

To export the metrics from 

``app -> mimir -> grafana``

with help of opentelemetry javaagent setup.

## Steps :

```bash
 git clone https://github.com/anooptiwari2402/observability-setup.git

 cd observability-setup/sandbox-web-app && mvn clean install && cd ..
 
 docker build -t sandbox .
 
 docker-compose up
 
```

Now we can access grafana at 

```url
 localhost:3000
```

Now we can configure datasource as prometheus with URL

```url
 http://mimir:9009/prometheus
```

then click on save and test.

### Done

Now we can create Dashboard and able to see the metrics...




