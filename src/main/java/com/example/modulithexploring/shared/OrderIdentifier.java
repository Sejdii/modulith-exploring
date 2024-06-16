package com.example.modulithexploring.shared;

import java.util.UUID;
import org.jmolecules.ddd.types.Identifier;

public record OrderIdentifier(UUID id) implements Identifier {
}
