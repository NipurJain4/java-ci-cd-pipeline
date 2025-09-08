# CI/CD Pipeline Setup Guide

## Quick Setup Steps

### 1. Docker Hub Setup
```bash
# Create account at https://hub.docker.com
# Create repository: java-cicd-pipeline
```

### 2. GitHub Repository Setup
```bash
cd /home/nipur/hello-java-maven
git init
git add .
git commit -m "Initial CI/CD setup"
git branch -M main
git remote add origin https://github.com/YOUR_USERNAME/java-cicd-pipeline.git
git push -u origin main
```

### 3. GitHub Secrets Configuration
Go to GitHub repo → Settings → Secrets and variables → Actions

Add these secrets:
- `DOCKER_USERNAME`: Your Docker Hub username
- `DOCKER_PASSWORD`: Your Docker Hub password/token

### 4. Local Testing
```bash
# Build and test
mvn clean package

# Build Docker image
docker build -t java-cicd-pipeline .

# Run container
docker run -p 8080:8080 java-cicd-pipeline
```

### 5. Minikube Deployment
```bash
# Start Minikube
minikube start

# Update k8s-deployment.yml with your Docker Hub username
# Deploy to Kubernetes
kubectl apply -f k8s-deployment.yml

# Get service URL
minikube service hello-java-service --url
```

## Files Created
- `Dockerfile` - Container configuration
- `docker-compose.yml` - Local development
- `.github/workflows/ci-cd.yml` - CI/CD pipeline
- `k8s-deployment.yml` - Kubernetes deployment
- `src/test/java/HelloWorldTest.java` - Basic test

## Expected Results
1. ✅ GitHub Actions builds and tests on push
2. ✅ Docker image pushed to Docker Hub
3. ✅ Local deployment with Minikube
4. ✅ Application accessible via browser
