# OFT Android Repository

This repository contains the Android implementation of requirements defined in the OFT System repo.

## Simplified Directory Structure

```
oft-android/
├── requirements.md       # Component requirements with OFT syntax
├── src/                  # Main source code
│   └── FooProvider.kt    # Implementation of string capability
├── test/                 # Test code
│   └── FooProviderTest.kt# Tests for implementation
└── .github/workflows/    # CI/CD configuration
```

## Requirements & OpenFastTrace Integration

Requirements are defined in `requirements.md` using [OpenFastTrace](https://github.com/itsallcode/openfasttrace) syntax.

For example:
```markdown
[req~android.string-return~1]
The Android implementation shall provide a function that returns the string "foo".

[covers~sys.string-return~1]
```

## Implementation with Traceability

The implementation uses OFT tracing tags:

- `src/FooProvider.kt`: Contains the implementation with the tag `[impl->req~android.string-return~1]`
- `test/FooProviderTest.kt`: Contains tests with the tag `[utest->req~android.string-return~1]`

These tags allow OpenFastTrace to automatically verify requirement coverage.

## How OpenFastTrace Works

1. **Define Requirements**: Requirements are defined with the `[req~...]` syntax
2. **Trace Coverage**: Implementation is tagged with `[impl->req~...]`
3. **Verify with Tests**: Tests are tagged with `[utest->req~...]`
4. **Generate Reports**: OFT generates coverage reports

## CI/CD with OpenFastTrace

Our GitHub Actions workflow:

1. Creates a temporary Gradle structure for testing
2. Runs the Android tests to verify functional correctness
3. Installs OpenFastTrace
4. Runs `oft import` to scan all files for requirement artifacts
5. Runs `oft report` to generate a coverage report
6. Uploads the report as an artifact for system-level aggregation

## Building & Testing

```bash
# Build (assuming Gradle setup)
./gradlew build

# Test
./gradlew test

# Run OFT analysis (if installed)
oft import -i .
oft report
``` 