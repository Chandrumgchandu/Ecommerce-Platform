# Ecommerce Platform — Spring Boot CI/CD Sample

A compact Spring Boot project used to demonstrate application build, testing, Docker packaging, and GitHub Actions validation.

## What this repo proves

- Java/Spring Boot application structure under `app/store`.
- Maven wrapper for reproducible local builds.
- Unit test coverage for the small cart service example.
- Dockerfile for packaging the Spring Boot application.
- GitHub Actions workflow for automated build/test validation.
- Repository hygiene cleanup: generated JARs are not tracked in source control.

## Repository structure

```text
.
├── .github/workflows/build.yml
├── app/store/
│   ├── Dockerfile
│   ├── pom.xml
│   ├── src/main/java/com/chandru/store
│   └── src/test/java/com/chandru/store
└── README.md
```

## Local build and test

```bash
cd app/store
./mvnw clean test
./mvnw clean package
docker build -t ecommerce-store:local .
```

## CI/CD evidence

The GitHub Actions workflow in `.github/workflows/build.yml` validates the Maven project on push and pull request events. This makes the repo a supporting example for automated Java build/test checks.

## Hygiene notes

Generated artifacts such as `target/` and built `.jar` files should remain untracked. Use CI artifacts, release assets, or a package registry when a compiled build output needs to be preserved.

## Portfolio note

This is a supporting application/CI sample. The repository is intentionally described only by what is visible in the code: Spring Boot, Maven tests, Docker packaging, and GitHub Actions validation.
