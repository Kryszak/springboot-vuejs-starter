container_name=app
storage_location=${1:-$(pwd)}
application_port=${2:-5000}
#gradle clean docker
docker stop ${container_name}
docker rm ${container_name}
docker run -d --name ${container_name} -v ${storage_location}:/logs -p ${application_port}:8080 com.kryszak/springboot-vuejs-starter