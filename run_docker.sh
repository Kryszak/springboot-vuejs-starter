container_name=app
storage_location=${1:-$(pwd)}
application_port=${2:-5000}
gradle docker
docker rm ${container_name}
docker run -d --name ${container_name} -v ${storage_location}:/logs -p 5000:8080 com.kryszak/springboot-vuejs-starter